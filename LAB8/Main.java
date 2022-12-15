import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Painting> Gallery = new ArrayList<>();
        Painting p1 = new Painting("Ivan", "Renaissance");
        Painting.PaintingSize p1size = p1.new PaintingSize(5.43,4.3);
        Painting p2 = new Painting("Pesho", "Classical");
        Gallery.add(p1);
        Gallery.add(p2);
        Gallery.remove(p2);

        PrintPaintingInfo print = new PrintPaintingInfo() {
            @Override
            public void printPaintingInfo(Painting p, Painting.PaintingSize  pSize) {
                System.out.println("Painting's info:");
                System.out.println("The author:" + p.getAuthor());
                System.out.println("The style of the painting:" + p.getStyle());
                System.out.println("The height of the painting: " +  pSize.getHeight());
                System.out.println("The width of the painting: " + pSize.getWidth());
            }
        };

        print.printPaintingInfo(p1,p1size);


    }
}