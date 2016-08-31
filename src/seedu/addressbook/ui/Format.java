package seedu.addressbook.ui;

import java.util.List;

public interface Format {
	
	public String getIndexedListForViewing(List<String> listItems);
	public String getIndexedListItem(int visibleIndex, String listItem);

}
