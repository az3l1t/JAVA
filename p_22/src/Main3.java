// Базовый интерфейс для документов
interface IDocument {
    void open();
    void save();
}

// Конкретный класс TextDocument
class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Opening text document");
    }

    @Override
    public void save() {
        System.out.println("Saving text document");
    }
}

// Фабрика создания TextDocument
class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}

// Интерфейс фабрики документов
interface ICreateDocument {
    IDocument createNew();
    IDocument createOpen();
}

// Каркас приложения редактора документов
class Editor {
    private IDocument document;
    private ICreateDocument documentFactory;

    public Editor(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        document.open();
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("No document is currently open.");
        }
    }
}

// Пример использования
public class Main3 {
    public static void main(String[] args) {
        // Создаем фабрику для документов
        ICreateDocument documentFactory = new CreateTextDocument();

        // Создаем экземпляр редактора с фабрикой документов
        Editor editor = new Editor(documentFactory);

        // Создаем новый документ
        editor.createNewDocument();

        // Открываем существующий документ
        editor.openDocument();

        // Сохраняем текущий документ
        editor.saveDocument();
    }
}
