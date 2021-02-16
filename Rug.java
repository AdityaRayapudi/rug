public class Rug{

        private String Fur;
        private String Color;

        public Rug(String Fur, String Color)
        {
            setFur(Fur);
            setFur(Color);
            this.Color = Color;
            this.Fur = Fur;


        }
        public void setFur(String Fur)
        {
            this.Fur = Fur;
        }

        public void setColor(String Color)
        {
            this.Color = Color;
        }

        public String getFur()
        {
        return Fur;
        }

        public String getColor()
        {
        return Color;
        }

            public static void main(String args[])
            {
            Rug mat = new Rug("Soft", "white");
            System.out.println(mat.getColor());
            }
          


}
