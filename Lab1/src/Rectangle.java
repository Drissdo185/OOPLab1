public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Error: Width and height must be non-negative. Setting values to 1.");
            this.width = 1;
            this.height = 1;
        } else {
            this.width = width;
            this.height = height;
        }
    }


    public int getWight() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWight(int newWidth) {
        this.width = newWidth;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void visualize() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
