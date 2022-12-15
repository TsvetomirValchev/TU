//Система за Галерия
//
//        Всяка картина има стил,автор и размери,
//        трябва да има възможност за добавяне на картина
//        триене на картини
//        и печатане на инфо за тях
//
//        Реализирайте използвайки поне 1 вложен клас и 1 анонимен такъв
//        Направете интерфейс s method printPictureInfo (anonimen)
//        размерите са вложен клас.

import java.util.ArrayList;

public class Painting {
    private String style;
    private String author;






    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Painting(String author, String style)
    {
        this.author = author;
        this.style = style;

    }

    class PaintingSize
    {

        private double width;
        private double height;

    public PaintingSize(double height, double width){
            this.height = height;
            this.width = width;
    }


        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }



    }

    public void addPaintingToGallery(ArrayList<Painting>gallery, Painting p)
    {
        gallery.add(p);
    }

    public void removePaintingFromGallery(ArrayList<Painting>gallery, Painting p)
    {
        gallery.remove(p);
    }




}
