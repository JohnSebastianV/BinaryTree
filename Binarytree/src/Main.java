public class Main {
    public static void main(String[] args) {
        // Construir el árbol de ejemplo
        BinaryTree tree = new BinaryTree(1);
        tree.left = new BinaryTree(2);
        tree.right = new BinaryTree(3);
        tree.left.left = new BinaryTree(4);
        tree.left.left.right = new BinaryTree(9);
        tree.right.left = new BinaryTree(6);
        tree.right.right = new BinaryTree(7);

        // Configurar la función de devolución de llamada
        Callback callback = new SomeCallback();

        // Realizar el recorrido en orden con la función de devolución de llamada
        TreeTraversal.inOrderTraversal(tree, callback);
    }
}