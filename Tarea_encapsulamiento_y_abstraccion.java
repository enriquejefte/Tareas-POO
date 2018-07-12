public class Abstraccion {

    public static void main(String arg[]) {
    	
        Casio cas = new Casio();

        System.out.println(cas.Fabricante());
        System.out.println(cas.Tamano());
        System.out.println(cas.Color());
        System.out.println(cas.Modelo());

        HewlettPackard hp = new HewlettPackard();

        System.out.println(hp.Fabricante());
        System.out.println(hp.Tamano());
        System.out.println(hp.Color());
        System.out.println(hp.Modelo());

        Sharp sh = new Sharp();

        System.out.println(sh.Fabricante());
        System.out.println(sh.Tamano());
        System.out.println(sh.Color());
        System.out.println(sh.Modelo());
    }

    public static abstract class Calculadora {

        abstract String Fabricante();
        abstract String Tamano();
        abstract String Color();
        abstract String Modelo();

    }

    public static class Casio extends Calculadora {

      
        public String Fabricante() {
            return "Casio";
        }
        public String Tamano() {
            return "El tama\u00f1o es de 14.4 x 3 x 23.1 cm";
        }
        public String Color() {
            return "El color es Negro";
        }
        public String Modelo() {
            return "Modelo FX-82ES PLUS\n\n";
        }

    }

    public static class HewlettPackard extends Calculadora {   

        public String Fabricante() {
            return "Hewlett-Packard";
        }
        public String Tamano() {
            return "El tama\u00f1o es de 8.2 x 1.8 x 15.8 cm";
        }
        public String Color() {
            return "El color es Blanco";
        }
        public String Modelo() {
            return "Modelo HP-35S/B12\n\n";
        }

    } 

    public static class Sharp extends Calculadora {

        public String Fabricante() {
            return "Sharp";
        }
        public String Tamano() {
            return "El tama\u00f1o es de 7.9 x 1.6 x 15.5 cm";
        }
        public String Color() {
            return "El color es Gris";
        }
        public String Modelo() {
            return "Modelo EL-W531H\n\n";
        }

    }

}