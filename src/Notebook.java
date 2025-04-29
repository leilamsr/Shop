public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    private static int count = 2;

    public Notebook(String title, double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return super.toString() + pageCount + "\t" + isHardCover;
    }

    @Override
    protected String generateId() {
        return "Notebook " + count++;
    }
}
