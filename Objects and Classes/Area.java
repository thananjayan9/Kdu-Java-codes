class Area {

    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area area = new Area();
        area.setDim(5, 10);
        System.out.println("The area of the rectangle is: " + area.getArea());
    }
}