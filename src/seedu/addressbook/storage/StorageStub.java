package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub extends Storage {

	public StorageStub(String filePath) {
		// creates a StorageStub object that doesn't have any attributes
	}
	@Override
	public void save(AddressBook addressBook) throws StorageOperationException {
		// does nothing	
	}

	@Override
	public AddressBook load() throws StorageOperationException {
		// returns a new AddressBook object
		return new AddressBook();
	}

	@Override
	public String getPath() {
		return null;
	}

}
