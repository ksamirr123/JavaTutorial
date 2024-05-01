
public class tree {
    static class node {
        int data;
        Node left;
        Node right;this.data=data;this.left=null;this.right=null;
    }

    static class binarytree {
        static int idx = -1;

        public static Node buildtree(int node[]) {
            if (node[idx] == -1) {
                return null;
            }
            Node newnode = new Node(node[idx]);
            newnode.left = buildtree(node);
            newnode.right = buildtree(node);
            return newnode;
        }
    }

    public static void main(String[]args){
        int node[]={1,2,4,-1,-1,5,-1,,-1,3,-1,6,-1,-1};
        Binarytree trees  =new binarytree();
        Node root = tree.buildtree(node);
        System.out.println(root);
    }

}
