package Lecture22LL1;

public class IndexInLL {
    public static int findIndex(NodeClass<Integer> head , int target){
        int index = 0;
        NodeClass<Integer> temp = head;
        while(temp != null){
            if(temp.data == target)
                return index;
            temp = temp.next;
            index++;
        }
        return -99;
    }
    public static void main(String[] args) {
        NodeClass<Integer> head = CreateLL.creatingLL();
        int element = 6 ;//to find
        int ans = findIndex(head, element);
        System.out.println(element +" found at Index " + ans);
    }
}
