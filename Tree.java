/**
* The main class file.
*
* @author Navin Balekomebole
* @version 1.0
* @since 2023-06-05
*/

public class Tree {
    int numberOfLeaves; // Number of leaves on the tree
    int feetTall; // Height of the tree in feet
    String type; // Type of the tree
    int age; // Age of the tree in years

    // Constructor to initialize the tree with provided values
    public Tree(int initNumberOfLeaves, int initFeetTall, String type, int age) {
        this.numberOfLeaves = initNumberOfLeaves;
        this.feetTall = initFeetTall;
        this.type = type;
        this.age = age;
    }

    // Method to simulate growth of the tree
    public void grow() {
        this.feetTall += 5; // Increment the height of the tree by 5 feet
        this.numberOfLeaves += 10000; // Increment the number of leaves by 10000
        this.age++; // Increment age by 1.
    }

    // Method to simulate growth of the tree
    public void grow(int addFeet, int addLeaf) {
        this.feetTall += addFeet; // Increment the height of the tree.
        this.numberOfLeaves += addLeaf; // Increment the number of leaves.
        this.age++; // Increment age by 1.
    }

    // Method to simulate the tree losing all its leaves
    public void loseAllLeaves() {
        this.numberOfLeaves = 0; // Set the number of leaves to 0
    }

    // Method to simulate slow growth of the tree
    public void growSlow() {
        this.age++; // Increment age by 1.
        this.feetTall++; // Increment the height of the tree by 1 foot
    }
}