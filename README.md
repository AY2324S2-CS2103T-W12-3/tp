# AssetBook 3 User Guide

## Product Overview
AssetBook 3 is a sophisticated command-line interface application tailored for the effective management of contacts and assets. Its comprehensive feature set includes capabilities for adding, deleting, editing, and searching contacts and assets, as well as assigning assets to specific points of contact (PoCs). This application is a valuable tool for businesses and individuals who need to systematically organize a large volume of contacts and assets.

## Table of Contents
1. Product Overview
2. Quick Start
3. Features
4. FAQ
5. Command Summary

## Quick Start
### Installation
- **Procedure**: Download AssetBook 3 from the official website and follow the provided installation instructions.
- **System Requirements**: Ensure your computer meets the necessary system requirements detailed on the website.

### Launching the Application
- **Opening the App**: Open your terminal or command-line interface.
- **Starting the App**: Type `assetbook3` and press Enter to launch the application.

### Entering Commands
- **Command Execution**: Type your command in the terminal and provide the required parameters.
- **Example**: To add a contact, enter `add` followed by the necessary details like `--name John Doe`.

## Features
### 1. Add
- **Purpose**: To introduce new contacts or assets into the system.
- **Syntax for Contact**: `add --name <name> [--email <email> --phone <phone>] [--tag <tag> [...]]`
- **Syntax for Asset**: `add --id <asset id> --location <location>`
- **Fields**:
  - **Name**: Enter contact's name (case-sensitive, no trailing spaces).
  - **Email**: Valid email address containing '@'.
  - **Phone**: Contact's phone number (digits and optional '+' at start).
  - **Tag**: Tags for contact categorization (case-sensitive, no spaces).
  - **ID**: Unique identifier for the asset.
  - **Location**: Asset's location.
- **Example**:
  - Contact: `add --name Jane Doe --email janedoe@example.com --phone 123456789 --tag client`
  - Asset: `add --id 1001 --location MainOffice`

### 2. Delete
- **Purpose**: To remove existing contacts or assets from the system.
- **Command**: `delete <[asset_id] | [person_id]>`
- **Usage**: Specify the unique ID of the contact or asset.
- **Example**: `delete p102`

### 3. Edit
- **Purpose**: To modify details of existing contacts or assets.
- **Command**: `edit <[asset_id] | [person_id]> [--email <email>] [--phone <phone>] [--tag <tag> [...]] | [--location <location>]`
- **Usage**: Choose the entity to edit and specify the new details.
- **Example**: `edit p102 --email newemail@domain.com --phone 987654321`

### 4. Search
- **Purpose**: To find contacts, assets, or specific tags.
- **Command**: `search [--contact] [--asset] [--tag] <string>`
- **Usage**: Specify the category and the search term.
- **Example**: `search --asset --tag leased`

### 5. Assign assets to PoC
- **Purpose**: To link assets to a designated Point of Contact.
- **Command**: `assign <asset_id> <person_id>`
- **Usage**: Mention the asset ID and the corresponding PoC ID.
- **Example**: `assign 1001 p102`
- **Note**: Upcoming versions will support bulk assignments.

## FAQ
**How to add multiple tags to a contact?**
- Use the `add` command with multiple `--tag` options, e.g., `add --name Alice --tag friend --tag colleague`.

**What if I enter a command incorrectly?**
- The system will display an error message. Review the command format in the Command Summary and retry.

**Can I update an asset's location using the `edit` command?**
- Yes, use `edit <asset_id> --location <new location>`, e.g., `edit 1001 --location SecondaryOffice`.

**How to view all assets assigned to a specific PoC?**
- Use the `search` command with the PoC's ID, like `search --contact p102`.

## Command Summary
- **add**: Add new contacts or assets.
- **delete**: Remove existing contacts or assets.
- **edit**: Modify details of contacts or assets.
- **search**: Locate contacts, assets, or tags.
- **assign**: Link assets to Points of Contact.
