package PZ_13.Materials;

 public class Main {
     public static void main(String[] args) {
//         WritingMaterials pen = new WritingMaterials();
//         pen.setLength(15.6);
//         pen.setPrice(145);
//         pen.setDraw(true);
//         pen.display();
//         pen.drawe("Красный", 5);
//         pen.priceDown(10);
//         pen.display();
//         pen.priceUp(23);
//         pen.display();
//         pen.replace_rod("Синий");
//         pen.drawe(5);
//
//         WritingMaterials ruler = new WritingMaterials("Линейка", 25);
//         ruler.setLength(30.0);
//         ruler.setDraw(false);
//         ruler.display();
//         ruler.drawe();
//         ruler.priceUp(13);
//         ruler.display();
//
//         WritingMaterials pencil = new WritingMaterials(10, 14.2, true);
//         pencil.setName("Карандаш");
//         pencil.setColor("Серый");
//         pencil.display();
//         pencil.drawe("Серый");
//         pencil.priceUp(15);
//         pencil.display();
//
//         WritingMaterials zamazka = new WritingMaterials("Замазка", "Белый", 10.2, 50, true);
//         zamazka.display();
//         zamazka.drawe(1);
//         System.out.println(zamazka.getName());
//         System.out.println(zamazka.getColor());
//         System.out.println(zamazka.getLength());
//         System.out.println(zamazka.getPrice());
//         System.out.println(zamazka.isDraw());
         Pen p = new Pen();
         p.setColor("Красный");
         p.setName("Паркер");
         p.setLength(15.6);
         p.setPrice(145);
         p.setDraw(true);
         p.setCountColor(2);
         p.setAuto(false);
         p.display();
         System.out.println(p.getCountColor());
         System.out.println(p.isAuto());
         p.WriteMyName();


         Ruler r = new Ruler();
         r.setColor("желтая");
         r.setName("линейка");
         r.setLength(15.6);
         r.setPrice(145);
         r.setDraw(false);
         r.setLength1(25);
         r.setWood(true);
         r.display();
         System.out.println(r.getLength1());
         System.out.println(r.isWood());
         r.measure();

         Divider d = new Divider();
         d.setColor("синий");
         d.setName("Циркуль");
         d.setLength(15.6);
         d.setPrice(145);
         d.setDraw(true);
         d.setDividerType("без карандаша");;
         d.setMetal(true);
         d.display();
         System.out.println(d.getDividerType());
         System.out.println(d.isMetal());
         d.draw_circle();
     }
 }
