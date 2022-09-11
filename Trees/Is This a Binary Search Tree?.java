    public boolean checkBST(Node root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root , list);
        
        int min = Integer.MIN_VALUE;
        
        for (int ele : list)
        {
            if (min >= ele)
                return false;
            min = ele;
        }
        
        return true;
    }

    public void inOrder(Node root, List<Integer> list) 
    {
        if (root == null)
            return;
        inOrder(root.left , list);
        list.add(root.data);
        inOrder(root.right , list);
        
    }
