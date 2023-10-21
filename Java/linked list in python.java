  //python 

#Represent a node of the singly linked list  
class Node:  
    def __init__(self,data):  
        self.data = data;  
        self.next = None;  
          
class SinglyLinkedList:  
    #Represent the head and tail of the singly linked list  
    def __init__(self):  
        self.head = None;  
        self.tail = None;  
          
    #addNode() will add a new node to the list  
    def addNode(self, data):  
        #Create a new node  
        newNode = Node(data);  
          
        #Checks if the list is empty  
        if(self.head == None):  
            #If list is empty, both head and tail will point to new node  
            self.head = newNode;  
            self.tail = newNode;  
        else:  
            #newNode will be added after tail such that tail's next will point to newNode  
            self.tail.next = newNode;  
            #newNode will become new tail of the list  
            self.tail = newNode;  
              
    #display() will display all the nodes present in the list  
    def display(self):  
        #Node current will point to head  
        current = self.head;  
          
        if(self.head == None):  
            print("List is empty");  
            return;  
        print("Nodes of singly linked list: ");  
        while(current != None):  
            #Prints each node by incrementing pointer  
            print(current.data),  
            current = current.next;  
   
sList = SinglyLinkedList();  
          
#Add nodes to the list  
sList.addNode(1);  
sList.addNode(2);  
sList.addNode(3);  
sList.addNode(4);  
   
#Displays the nodes present in the list  
sList.display();  