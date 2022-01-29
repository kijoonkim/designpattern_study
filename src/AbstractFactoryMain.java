
import pattern.abstractfactory.factory.*;

public class AbstractFactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1){
			System.out.println("Usage: java AbstractFactoryMain class.name.ConcreteFactory");
			System.out.println("Example 1: java AbstractFactoryMain listabstractfactory.ListFactory");
			System.out.println("Example 1: java AbstractFactoryMain listabstractfactory.TableFactory");
		}
		Factory factory = Factory.getFactory(args[0]);
		Link joins = factory.createLink("�߾��Ϻ�", "http://www.joins.com/");
		Link chosun = factory.createLink("�����Ϻ�", "http://www.chosun.com/");
		
		Link us_yahoo = factory.createLink("Yahoo", "http://www.yahoo.com");
		Link kr_yahoo = factory.createLink("Yahoo!Korea", "http://www.yahoo.co.kr");
		Link excite = factory.createLink("Excite", "http://www.excite.com");
		Link google = factory.createLink("Google", "http://www.google.com");
		
		Tray traynews = factory.createTray("�Ź�");
		traynews.add(joins);
		traynews.add(chosun);
		
		Tray trayyahoo = factory.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(kr_yahoo);
		
		Tray traysearch = factory.createTray("�˻�����");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);
		
		Page page = factory.createPage("LinkPage", "��������");
		page.add(traynews);
		page.add(traysearch);
		page.output();

	}

}
