interface Callback {
    void execute(BinaryTree node);
}

class SomeCallback implements Callback {
    @Override
    public void execute(BinaryTree node) {
        // Aquí se llama a la función de devolución de llamada
        System.out.println("callback(" + node.value + ")");
    }
}

