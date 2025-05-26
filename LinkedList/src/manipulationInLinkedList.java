public class manipulationInLinkedList {

    public void addAtIndex(int index, int item) {

        if (index<0 || index > size){
            throw new Expection ("Invalid Index.");

        }

        if (index == 0){
            addFirst(item);
        }else if (index==this.size){
            addLast(item);
        }
        else{
            //Create a new node
            Node nn = new Node();
            nn.data = item;
            nn.next = null;

            //Attach
            Node nm1 = getNodeAt (index-1);
            Node np1 = nm1.next;

            nm1.next=nn;
            nn.next =np1;

            this.size++;
        }

        public int removeFirst(){

            if (this.size == 0){
                throw new Exception ("Linked List is Empty.");
            }

            int rv = this.head.data;
             if (this.size == 1){
                 this.head = null;
                 this.tail = null;
                 this.size = 0;

             }
             else {
                 this.head = this.head.next;
                 this.size--;
             }

        }

        public int removeLast () throws Exception {

            if (this.size == 0){
                throw new Exception ("Linked List is empty.");

            }

            int rv = this.tail.data;

            if (this.size == 1){
                this.head = null;
                this.tail = null ;
                this.size = 0;

            }
            else {
                Node sizem2 = getNodeAt(this.size - 2);
                this.tail = sizem2;
                this.tail.next=null;
                this.size--;
            }
            return rv;
        }

        public int removeAt(int index){

            if (this.size == 0 ){
                throw new Exception ("Linked List is Empty.");
            }

            if (index < 0 || index >= this.size){
                throw new Exception ("Invalid Index.");
            }
            if (index == 0){
                return removeFirst();
            }
            else if (index == this.size - 1 ){
                return removeLast();
            }
            else {
                Node nm1 = getNodeAt(index-1);
                Node n  = nm1.next;
                Node np1 = n.next;

                nm1.next = np1;

                this.size--;
               return n.data;
            }
        }

        public void reverseData(){

            int left = 0;
            int right = this.size-1;

            while (left < right){

                Node ln= getNodeAt(left);
                Node rn = getNodeAt(right);

                int temp = ln.data ;
                ln.data = rn.data;
                rn.data = temp;

                left++;
                right--;


            }
        }

        public void reverePointer(){

            Node prev = this.head;
            Node current = prev.next;

            while (current != null){
                Node ahead = current.next ;
                current.next = prev;

                prev = current;
                current = ahead;


            }

            //Swap
            Node t = this.head;
            this.head = this.tail;

            this.tail = t;

        }


    }

}