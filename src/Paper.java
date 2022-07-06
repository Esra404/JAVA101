public enum Paper {
    A1(200,233),A2(44,56),A3(666,122),A4(88,222);
    private int width;
    private  int length;
    Paper(int width, int length){
        this.width=width;
        this.length=length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
