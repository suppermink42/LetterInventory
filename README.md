# Letter Inventory

This class is designed to manage an inventory of alphabetic letters. It takes a string as input and tracks the number of occurrences of each letter, ignoring case and non-alphabetic characters like punctuation or digits.

## Features
- **Constructor**: Takes a string and builds the letter inventory by counting how many times each letter appears.
- **Case Insensitive**: Treats uppercase and lowercase letters as the same.
- **Ignores Non-Letters**: Excludes any character that is not a letter (punctuation, numbers, etc.).

## Methods
- `LetterInventory(String data)`: Initializes the inventory from a string.
- `get(char letter)`: Returns the count of the specified letter.
- `set(char letter, int value)`: Sets the count of the specified letter.
- `size()`: Returns the total number of letters in the inventory.
- `isEmpty()`: Checks if the inventory is empty.
- `toString()`: Returns a string representation of the inventory with letters in alphabetical order.
- `add(LetterInventory other)`: Adds two inventories together and returns a new `LetterInventory` object.
- `subtract(LetterInventory other)`: Subtracts one inventory from another and returns a new `LetterInventory` object or `null` if subtraction results in negative counts.
