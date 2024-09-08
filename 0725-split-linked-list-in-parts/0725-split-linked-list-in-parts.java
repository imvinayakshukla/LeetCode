class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        
        // Step 1: Calculate the size of the linked list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: Calculate the base size of each part and the number of extra nodes
        int equal = size / k;
        int extra = size % k;
        
        // Step 3: Create the result array
        ListNode[] result = new ListNode[k];
        temp = head;

        // Step 4: Split the list into parts
        for (int i = 0; i < k; i++) {
            result[i] = temp;  // Start of the current part
            ListNode prev = null;

            // Set the size of the current part
            int currentPartSize = equal + (extra > 0 ? 1 : 0); 
            extra--;  // Decrease extra node count after using one

            // Move temp forward by currentPartSize nodes
            for (int j = 0; j < currentPartSize; j++) {
                prev = temp;
                if (temp != null) {
                    temp = temp.next;
                }
            }

            // Break the link after the current part
            if (prev != null) {
                prev.next = null;
            }
        }

        return result;
    }
}
