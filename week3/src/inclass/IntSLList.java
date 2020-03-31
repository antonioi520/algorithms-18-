package inclass;

public class IntSLList {
	protected IntSLLNode head, tail;
	public IntSLList(){
		head = tail = null;
	}
	public boolean isEmpty(){
		return head == null;
	}
	
	public void addToHead(int el){
		head = new IntSLLNode(el, head);
		if(tail == null){
			tail = head;
		}
	}
	public void addToTail(int el){
		if(!isEmpty()){
			tail.next = new IntSLLNode(el);
			tail = tail.next;
		}
		else{ 
			head = tail = new IntSLLNode(el);
		}
	}
	public int deleteFromHead(){
		int el=head.info;
		if(head == tail){
			head = tail = null;
		}
		else{
			head = head.next;
		}
		return el;
	}
	public int deleteFromTail(){
		int el = tail.info;
		if(head == tail){
			head = tail = null;
		}
		else{
			IntSLLNode tmp;
			for(tmp = head; tmp.next != tail; tmp = tmp.next);
			tail = tmp;
			tail.next = null;
		}
		return el;
	}
	public void printAll(){
		for(IntSLLNode tmp = head; tmp != null; tmp = tmp.next){
			System.out.println(tmp.info + " ");
		}
	}
	public boolean isInList(int el){
		IntSLLNode tmp;
		for(tmp = head; tmp != null && tmp.info != el; tmp = tmp.next);
		return tmp != null;
	}
	
	public void delete(int el){
		if(!isEmpty())
			if(head == tail && el == head.info)
				head = tail = null;
			else if (el == head.info)
				head = head.next;
			else{
				IntSLLNode pred, tmp;
				for(pred = head, tmp = head.next;
					tmp != null && tmp.info != el;
					pred = pred.next, tmp = tmp.next);
				if(tmp != null){
					pred.next = tmp.next;
					if(tmp == tail)
						tail = pred;
				}
			}
	}
	//homework
	public void sum(){
		int sum = 0;
		for(IntSLLNode tmp = head; tmp != null; tmp = tmp.next){
			sum = sum + tmp.info;			
		}
		System.out.println(sum);
	}
	public void max(){
		int max = 0;
		for(IntSLLNode tmp = head; tmp != null; tmp = tmp.next){
			if(max <= tmp.info)
				max = tmp.info;
		}
		System.out.println(max);
	}
	public void min(){
		int min=0;
		for(IntSLLNode tmp = head; tmp != null; tmp = tmp.next){	
			if(min == 0){
				min = tmp.info;
			}
			if(min >= tmp.info)
				min = tmp.info;
		}
		System.out.println(min);
	}
	
	public void removeDuplicates(){
		if(!isEmpty()){
			if (head==tail){
				return;
			}
			for(IntSLLNode chk = head; chk != null; chk = chk.next){
				for(IntSLLNode pred = chk, tmp = chk.next; tmp != null; pred = pred.next, tmp = tmp.next){
					if(chk.info == tmp.info){
						pred.next = tmp.next;
						if(tmp.next != null){
							tmp = tmp.next;
							if(chk.info == tmp.info && tmp.next == null){
								tail = pred;
								pred.next = tmp.next;
							}
						}
						else{
							tail = tmp;
						}
					}
				}
			}
		}
	}
	
	public void removeMedian(){
		if(!isEmpty()){
			if(head == tail || head.next == tail){
				head = tail = null;
				return;
			}
			int lSize = 0;
			int hSize = 0;
			for(IntSLLNode tmp = head; tmp != null; tmp = tmp.next, lSize++){
				hSize = lSize/2;
			}
			for(IntSLLNode pred = head, tmp = head.next; hSize > 0; pred = pred.next, tmp = tmp.next, hSize--){
				if(lSize % 2 != 1){
					if(hSize == 2){
						pred.next.next = tmp.next.next;
						pred.next = tmp.next;
					}
				}
				else if(hSize == 1){
					pred.next = tmp.next;
				}
			}
		}
	}

}
