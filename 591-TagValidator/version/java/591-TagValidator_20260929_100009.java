// Last updated: 9/29/2026, 10:00:09 AM
1class Solution {
2    public boolean isValid(String code) {
3        Stack<String>stack=new Stack<>();
4        for(int i=0;i<code.length();){
5            if(i>0&&stack.isEmpty()) return false;
6            if(code.startsWith("<![CDATA[", i)) {
7                int j = code.indexOf("]]>", i);
8                if (j < 0) return false;
9                i = j + 3;
10            } else if (code.startsWith("</", i)) {
11                int j = code.indexOf(">", i);
12                if (j < 0) return false;
13                String tag = code.substring(i + 2, j);
14                if (stack.isEmpty() || !stack.pop().equals(tag)) return false;
15                i = j + 1;
16            } else if (code.startsWith("<", i)) {
17                int j = code.indexOf(">", i);
18                if (j < 0) return false;
19                String tag = code.substring(i + 1, j);
20                if (tag.length() < 1 || tag.length() > 9 || !tag.chars().allMatch(Character::isUpperCase)) return false;
21                stack.push(tag);
22                i = j + 1;
23            } else {
24                i++;
25            }
26        }
27        return stack.isEmpty();
28        
29        
30    }
31}