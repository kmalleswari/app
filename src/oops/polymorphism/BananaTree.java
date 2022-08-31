package oops.polymorphism;

class Tree
{
	public void leafs()
	{
		System.out.println("Tree leafs");
	}
}

public class BananaTree extends Tree
{
  public void leafs()
  {
	  System.out.println("BananaTree leafs");
  }
  public static void main(String[] args)
  {
	  BananaTree b = new BananaTree();
	  b.leafs();
	   Tree t = new Tree();
	   t.leafs();
   }
}


