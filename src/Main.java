public class Main {
    public static void main(String[] args) {

     Java bot1 = new Java("Abdymomun",17,"M","abdymomun@gmail.com");
     Java bot2 = new Java("Erzhigit",19,"M","era.era@gmail.com");
     Java bot3 = new Java("Baktiar",20,"M","abdyrahmanov@gmail.com");
     Java bot4 = new Java("Mirbek",16,"M","miko.kg@gmail.com");
     Java bot5 = new Java("Manas",27,"M","manasbek.00@gmail.com");
     Java bot6 = new Java("Matmusa",21,"M","mat.studio@gmail.com");
     Java bot7 = new Java("Stalbek",32,"M","stalbek.bayke@gmail.com");

     Java[] javas1 = {bot1, bot2, bot3, bot4, bot5};
     Java[] javas2 = {bot6, bot7};

     Android and1 = new Android("Datka",22,"F","datka.kg@gmail.com");
     Android and2 = new Android("Ulan",27,"M","ulan.studio@gmail.com");
     Android and3 = new Android("Kanykey",17,"F","kanykey.2006.@gmail.com");
     Android and4 = new Android("Nurseiyt",17,"M","nurseiyt@gmail.com");

     Android[] androids1 = {and1, and2, and3};
     Android[] androids2 = {and4};

     Go suu1 = new Go("Temirlan",21, "M","temirlan.kgz@gmail.com");
     Go suu2 = new Go("Kayrat",20, "M","kayrat.000.@gmail.com");
     Go suu3 = new Go("Madina",17, "F","madina.gul.kg@gmail.com");

     Go[] gos1 = {suu1, suu2};
     Go[] gos2 = {suu3};

     Company company1 = new Company("Mendeleeva 101","Esen Niyazov",javas1,androids1,gos1);
     Company company2 = new Company("Chuyskiy 3","Aybek Sariev",javas2,androids2,gos2);

     System.out.println(company1);
     System.out.println(company2);


   }


}