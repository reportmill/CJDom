package cjdom;
import netscape.javascript.JSObject;
import java.util.function.Consumer;

/**
 * A class to represent a FilePicker.
 */
public class FilePicker {

    // The function to be called when file picked
    private Consumer<FilePicker> _filePickedHandler;

    // The last picked file name
    private String _pickedFilename;

    // The last read file bytes
    private byte[] _pickedFileBytes;

    /**
     * Constructor.
     */
    public FilePicker()
    {
        super();
    }

    /**
     * Returns the last picked file name.
     */
    public String getPickedFilename()  { return _pickedFilename; }

    /**
     * Returns the last picked file name.
     */
    public byte[] getPickedFileBytes()  { return _pickedFileBytes; }

    /**
     * Show file picker.
     */
    public void showFilePicker(String[] fileTypes, Consumer<FilePicker> filePickedHandler)
    {
        _filePickedHandler = filePickedHandler;

        // Create and configure inputElement
        HTMLDocument doc = HTMLDocument.getDocument();
        HTMLInputElement inputElement = (HTMLInputElement) doc.createElement("input");
        inputElement.setType("file");
        inputElement.setAcceptTypes(fileTypes);
        inputElement.getStyle().setCssText("display: none;");
        inputElement.addEventListener("change", e -> handleFilePickerChange(inputElement, e));

        // Add to doc body
        HTMLBodyElement body = doc.getBody();
        body.appendChild(inputElement);
        inputElement.click();
    }

    /**
     * Called when user selects a file or cancels file picker.
     */
    private void handleFilePickerChange(HTMLInputElement inputElement, Event changeEvent)
    {
        // Get file
        File file = getFileForChangeEvent(changeEvent);
        if (file != null) {
            FileReader fileReader = new FileReader();
            fileReader.readBytesAndRunLater(file, () -> handleFilePickerFileLoaded(file, fileReader));
        }
        else _filePickedHandler.accept(this);

        // Remove inputElement from page
        Node parentNode = inputElement.getParentNode();
        if (parentNode != null)
            parentNode.removeChild(inputElement);
    }

    /**
     * Called when file bytes are available.
     */
    private void handleFilePickerFileLoaded(File file, FileReader fileReader)
    {
        _pickedFilename = file.getName();
        _pickedFileBytes = fileReader.getResultBytes();
        _filePickedHandler.accept(this);
    }

    /**
     * Returns the file for a change event.
     */
    private static File getFileForChangeEvent(Event changeEvent)
    {
        // Get changeEvent.target.files (just return if null)
        JSObject target = changeEvent.getMember("target");
        JSObject filesList = CJObject.getMemberImpl(target, "files");
        if (filesList == null)
            return null;

        // Convert to File
        Array<JSObject> dropFilesArray = new Array<>(filesList);
        JSObject[] dropFilesJS = dropFilesArray.toArray(JSObject.class);
        JSObject dropFileJS = dropFilesJS.length > 0 ? dropFilesJS[0] : null;
        return dropFileJS != null ? new File(dropFileJS) : null;
    }
}
