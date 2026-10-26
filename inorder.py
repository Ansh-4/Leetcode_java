def inorderTraversal(self, root: TreeNode | None):
    res = []
    def inorder(node):
        if not root:
            return
            inorder(node.left)
            res.append(node.val)
            inorder(node.right)
        inorder(root)
        return res