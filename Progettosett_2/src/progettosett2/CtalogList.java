package progettosett2;

import java.util.List;

 class CtalogList {
	
	private List<Catalog> items;
	
	public CatalogList() {
        items = new ArrayList<>();
    }

    public void addItem(Catalog item) {
        items.add(item);
    }
}

