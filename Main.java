import functions.*;
import functions.basic.*;
import functions.meta.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws InappropriateFunctionPointException {

        // ArrayTabulatedFunction
        double[] values1 = {1, 2, 3, 4};
        ArrayTabulatedFunction arrayFunc1 = new ArrayTabulatedFunction(0, 3, values1);
        ArrayTabulatedFunction arrayFunc2 = new ArrayTabulatedFunction(0, 9, values1.clone());

        // toString()
        System.out.println("ArrayTabulatedFunction 1: " + arrayFunc1.toString());
        System.out.println("ArrayTabulatedFunction 2: " + arrayFunc2.toString());

        // equals()
        System.out.println("\nequals: " + arrayFunc1.equals(arrayFunc2));

        // hashCode()
        System.out.println("\nхэш-код 1: " + arrayFunc1.hashCode());
        System.out.println("хэш-код 2: " + arrayFunc2.hashCode());

        // clone()
        ArrayTabulatedFunction arrayFuncClone = (ArrayTabulatedFunction) arrayFunc1.clone();
        System.out.println("\nклон: " + arrayFuncClone.toString());

        // изменение оригинала, проверка клона
        arrayFunc1.setPointX(1, 1.003);
        System.out.println("\nпосле изменения оригинала (1.0; 2.0) на (1.003; 2.0):");
        System.out.println("оригинал: " + arrayFunc1.toString());
        System.out.println("клон: " + arrayFuncClone.toString());


        // LinkedListTabulatedFunction
        double[] values2 = {1, 2, 3, 4};
        LinkedListTabulatedFunction linkedListFunc1 = new LinkedListTabulatedFunction(0, 3, values2);
        LinkedListTabulatedFunction linkedListFunc2 = new LinkedListTabulatedFunction(0, 9, values2.clone());

        // toString()
        System.out.println("\nLinkedListTabulatedFunction 1: " + linkedListFunc1.toString());
        System.out.println("LinkedListTabulatedFunction 2: " + linkedListFunc2.toString());

        // equals()
        System.out.println("\nequals: " + linkedListFunc1.equals(linkedListFunc2));

        // hashCode()
        System.out.println("\nхэш-код 1: " + linkedListFunc1.hashCode());
        System.out.println("хэш-код 2: " + linkedListFunc2.hashCode());

        // clone()
        LinkedListTabulatedFunction linkedListFuncClone = (LinkedListTabulatedFunction) linkedListFunc1.clone();
        System.out.println("\nклон: " + linkedListFuncClone.toString());

        // изменение оригинала, проверка клона
        linkedListFunc1.setPointX(1, 1.003);
        System.out.println("\nпосле изменения оригинала (1.0; 2.0) на (1.003; 2.0):");
        System.out.println("оригинал: " + linkedListFunc1.toString());
        System.out.println("клон: " + linkedListFuncClone.toString());


        // ArrayTabulatedFunction и LinkedListTabulatedFunction
        double[] values3 = {1, 2, 3, 4};
        ArrayTabulatedFunction arrayFunc3 = new ArrayTabulatedFunction(0, 3, values3);
        LinkedListTabulatedFunction linkedListFunc3 = new LinkedListTabulatedFunction(0, 9, values3.clone());

        // toString()
        System.out.println("\nArrayTabulatedFunction: " + arrayFunc3.toString());
        System.out.println("LinkedListTabulatedFunction: " + linkedListFunc3.toString());

        // equals()
        System.out.println("\nequals: " + arrayFunc3.equals(linkedListFunc3));

        // hashCode()
        System.out.println("\nхэш-код 1: " + arrayFunc3.hashCode());
        System.out.println("хэш-код 2: " + linkedListFunc3.hashCode());

        // clone()
        ArrayTabulatedFunction arrayFuncClone1 = (ArrayTabulatedFunction) arrayFunc3.clone();
        System.out.println("\nклон: " + arrayFuncClone1.toString());

        // изменение оригинала, проверка клона
        arrayFunc3.setPointX(1, 1.003);
        System.out.println("\nпосле изменения оригинала (1.0; 2.0) на (1.003; 2.0):");
        System.out.println("оригинал: " + arrayFunc3.toString());
        System.out.println("клон: " + arrayFuncClone1.toString());
    }
}