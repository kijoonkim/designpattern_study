package pattern.abstractfactory.tablefactory;

import pattern.abstractfactory.factory.Factory;
import pattern.abstractfactory.factory.Link;
import pattern.abstractfactory.factory.Page;
import pattern.abstractfactory.factory.Tray;

public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return null;
	}

}
