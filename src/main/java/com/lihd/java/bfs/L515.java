package com.lihd.java.bfs;

import com.lihd.java.tree.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: lihd-leetcode
 * @description: 在每个树行中找最大值
 * 广度优先遍历的基本思路为：每次将根节点的相邻节点放入一个容器（队列）中，
 * 遍历到目前为止容器中所有节点，并在遍历的过程中再将每个节点的所有相邻节点放入容器中，重复此过程直到队列为空。
 * @author: li_hd
 * @create: 2020-04-20 16:52
 **/
public class L515 {

    public List<Integer> largestValues(TreeNode root) {

        if (root == null)
            return Collections.emptyList();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        LinkedList<Integer> list = new LinkedList<>();

        while (!queue.isEmpty()) {
            //计算当前节点相邻的节点数量
            int size = queue.size();
            int min = Integer.MIN_VALUE;
            //遍历当前节点相邻节点
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                min = Math.max(min, temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            list.add(min);
        }


        return list;

    }


}
