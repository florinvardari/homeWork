package Project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}
class ChromeDriver implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Firefox implements WebDriver{
    @Override
    public void open() {
        System.out.println("Open FireFox");

    }

    @Override
    public void close() {
        System.out.println("Close Fire Fox");
    }

    @Override
    public String getTitle() {
        return null;
    }
}
class Safari implements WebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        return null;
    }
}

