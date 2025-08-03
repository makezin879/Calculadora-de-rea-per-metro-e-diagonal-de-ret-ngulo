package operacoes;
public class Engineer {

        public double altura;
        public double largura;

        public double area(){
            double A= (largura*altura)/2;
            return A;
        }
        public double perimetro(){
            double P= 2*((altura + largura));
            return P;
        }
        public double diagonal(){
            double D= Math.sqrt((altura*altura)+(largura*largura));
            return D;
        }

    }


