package Uebung_19.Aufgabe_2;

/**
 * Created by maxr2011 on 10.02.2018.
 */
public class Binärbaum<E> {

  static Element root;

  public Binärbaum(){
    root = new Element("root");
  }

  public static void output(Element e){

    if(e.left != null) {
      System.out.println(e.name + "- left ->" + e.left.name);
      output(e.left);
    }

    if(e.right != null) {
      System.out.println(e.name + "- right ->" + e.right.name);
      output(e.right);
    }

  }

  public static void output(){
    output(root);
  }

  public static class Element {

    String name;

    Element left = null;
    Element right = null;

    public Element(String name){
      this.name = name;
    }

    public void setLeft(Element left) {
      this.left = left;
    }

    public void setRight(Element right) {
      this.right = right;
    }
  }

  public static void main(String[] args){

    Binärbaum<Element> BB = new Binärbaum<>();

    BB.root.name = "Cool";
    BB.root.left = new Element("Aaronson");
    BB.root.right = new Element("Zylla");
    BB.root.right.left = new Element("Garrett");

    output();

  }

}
