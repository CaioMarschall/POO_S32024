package atividade1;

public class Calculadora {
<<<<<<< HEAD

    int  numA;
    int  numB;
=======
    
    int numA;
    int numB;
>>>>>>> b8d02ac4bfdf885a2df57d05104b6b1a74d3de51

    int somar(){
        return numA + numB;
    }
<<<<<<< HEAD
    int subtrair(){
        return numA - numB;
    }
    double dividir(){
        return (double) numA / numB;
    }
    int multiplicar(){
        return numA * numB;
    }
    
    boolean VerificarNumeroPrimo(int n){


=======

    int subtrair(){
        return numA - numB;
    }

    int multiplicar(){
        return numA * numB;
    }

    double dividir(){
        return (double) numA / numB;
    }

    boolean verificarNumeroPrimo(int n){
>>>>>>> b8d02ac4bfdf885a2df57d05104b6b1a74d3de51

        if(n <= 1){
            return false;
        }

<<<<<<< HEAD
        if((n != 2) && (n % 2 == 0)){
            return false;
        }


=======
        if( (n != 2) && (n % 2 == 0) ){
            return false;
        }

>>>>>>> b8d02ac4bfdf885a2df57d05104b6b1a74d3de51
        for(int i = 3; i < n; i+=2){
            if(n % i == 0){
                return false;
            }
        }
<<<<<<< HEAD
        
        return true;
    }
=======

        return true;
    }


>>>>>>> b8d02ac4bfdf885a2df57d05104b6b1a74d3de51
}
