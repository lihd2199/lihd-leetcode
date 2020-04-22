package com.lihd.java.dfs;

import com.lihd.java.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @program: lihd-leetcode
 * @description: 在每个树行中找最大值
 * @author: li_hd
 * @create: 2020-04-20 16:38
 **/
public class L515 {


    public List<Integer> largestValues(TreeNode root) {

        Map<Integer, Integer> map = new TreeMap<>();

        helper(root, map, 0);

        List<Integer> list = new ArrayList<>();

        map.keySet().forEach(e -> list.add(map.get(e)));

        return list;

    }

    private void helper(TreeNode root, Map<Integer, Integer> map, int level) {

        if (root == null)
            return;

        if (map.get(level) == null) {
            map.put(level, root.val);
        } else {
            map.merge(level, root.val, Math::max);
        }

        helper(root.left, map, level + 1);

        helper(root.right, map, level + 1);

    }


}
