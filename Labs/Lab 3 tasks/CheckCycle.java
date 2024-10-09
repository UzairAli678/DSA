public class CheckCycle {
  
        static Node1 head;
    
        // Method to add nodes to the linked list
        public static void addNode(int data) {
            Node1 newNode = new Node1(data);
            if (head == null) {
                head = newNode;  // First node becomes the head
            } else {
                Node1 temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;  // Adding the new node to the end of the list
            }
        }
    
        // Method to manually create a cycle in the linked list for testing
        public static void createCycle() {
            if (head == null) 
            {return;

            }
    
            Node1 temp = head;
            Node1 cycleNode = null;
            int count = 1;
    
            // Traverse and link last node to the second node (for cycle creation)
            while (temp.next != null) {
                if (count == 2) {  // Assume cycle will start from the 2nd node
                    cycleNode = temp;
                }
                temp = temp.next;
                count++;
            }
            temp.next = cycleNode;  // Create the cycle
        }
    
        // Method to detect if a cycle exists in the linked list
        public static boolean hasCycle() {
            if (head == null) return false;
    
            Node1 temp1 = head;
            Node1 temp2 = head;
    
            while (temp1 != null )
            {
                temp2 = temp2.next;         // Move slow by 1 step
                temp1= temp1.next.next;    // Move fast by 2 steps
    
                if (temp2==temp1) {       // If slow meets fast, there's a cycle
                    return true;
                }
            }
            return false;
        }
    
        // Method to print the linked list (up to a certain limit to avoid infinite loop in case of a cycle)
        static void printList() {
            Node1 temp = head;
            int count = 0;
            while (temp != null) {  
                System.out.print(temp.data + " ");
                temp = temp.next;
                count++;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            // Add nodes to the linked list
            addNode(5);
            addNode(6);
            addNode(7);
            addNode(8);
            addNode(9);
    
            System.out.println("Linked List before creating a cycle:");
            printList();
    
            // Create a cycle manually
            createCycle();
    
            // Check for cycle detection
            if (hasCycle()) {
                System.out.println("Cycle detected in the linked list.");
            } else {
                System.out.println("No cycle in the linked list.");
            }
        }
    }
    

