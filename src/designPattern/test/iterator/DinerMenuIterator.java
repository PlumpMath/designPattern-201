package designPattern.test.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	MenuItem[] list;
	int position;

	public DinerMenuIterator(MenuItem[] list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return !(position >= list.length || list[position] == null);
	}

	@Override
	public MenuItem next() {
		return list[position++];
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can`t remove an item until you`ve done at least done next()");
		}
		if (list[position - 1] != null) {
			for (int i = position - 1; i < (list.length - 1); i++) {
				list[i] = list[i + 1];
			}
			list[list.length - 1] = null;
		}
	}

}
