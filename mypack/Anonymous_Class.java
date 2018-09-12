package mypack;

interface Printable
{
	void print();
}


class Document
{

public void display(Printable ref)
{
	ref.print();
	//System.out.println("In Document");
}
	
}


class Image
{

public void display(Printable ref)
{
	ref.print();
	//System.out.println("In Image");
}
	
}
public class Anonymous_Class {

	public static void main(String[] args)
	{
		//Anonymous Class having implementation of display method of Document
		Document  doc=new Document();
		doc.display(new Printable() {
			
			@Override
			public void print() {
				System.out.println("Printing Document");
				
			}
		});
		
		//Anonymous Class having implementation of display method of Image
		Image img=new Image();
		img.display(new Printable() {
			
			@Override
			public void print() {

System.out.println("Printing Image");
				
			}
		});

		
	}

}
