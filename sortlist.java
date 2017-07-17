public T get(int index)
{
		return findNodeAtIndex(index).value;
	}
	
	private Node findNodeAtIndex(int index)
  {
		if(index < 0 || index >= size())
    {
			throw new IllegalArgumentException(index + " is not valid index.");
		}
		Node current = root;
		
		int totalSmallerElements = (current.leftChild == null) ? 0 : current.leftChild.sizeOfSubTree();
		while(current!= null)
    {
			if(totalSmallerElements == index)
      {
				break;
			}
			if(totalSmallerElements > index)
      {
				current = current.leftChild;
				totalSmallerElements--;
				totalSmallerElements -= (current.rightChild == null) ? 0 : current.rightChild.sizeOfSubTree();
			}
      else 
      {
				totalSmallerElements++;
				current = current.rightChild;
				totalSmallerElements += (current.leftChild == null) ? 0 : current.leftChild.sizeOfSubTree();
			}
		}
		return current;
	}

