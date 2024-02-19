User credentials:
    Defendants:
        username: scooter143
        password: pinetr33s
        name: AdamScott
        role: Defendant
    Judges:
        username: oldman5
        password: uptown411
        name: SallySmith
        role: Judge
    Court Clerk:
        username: mysterybear7
        password: monkey29
        name: JaneDoe
        role: CourtClerk
    Public:
        username: statecollegePA
        password: PennState123
        name: BryanBarry
        role: Public


Refactored:
    - Added input prompts for users to know what to input. This is implemented within the users view classes.
    Within the classes they are told to type in a number for the action they want (Emily). Within the main method,
    when inputting the users role they are prompted to input a "CourtClerk", "Judge", "Defendant", or "Public" (Julian).
    - Added feedback to users. In the actors view classes, the users receive feedback when they have been logged in by
     telling the user "You are now logged in." Additionally, in the main, if the user does not enter the right
     information, they are told their input is invalid and to try again (Emily).
    - Added an MVC structure to the project (Emily).
    - Created a fascade in main method to store all cases. This allows all users with different roles to access cases
    (Julian).
    - Adjusted authentication functionality by storing the usernames and passwords in a hashmap to ensure that when users
    attempt to log on it will verify with already created usernames and passwords.(Ryan)
    - Removed unused imports, made code style and spacing more consistent, enhanced readability (Nick)
    - Changed some behavior in the menus so that the program does not log out the user after performing an action (Nick)

Final submission

nrr5199 | Nicholas Rizzio
    Fully implemented authentication functionality with four users
    See top of file for credentials
    20% of final project
rps5738 | Ryan Sheppard
    Fully implemented public user use cases
    20% of final project
exm5536 | Emily Martin
    Implemented action selection functionality
    Implemented error-handling if user entered unexpected input
    Implemented feedback when logging in successfully
    20% of final project
jav5509 | Julian Vazquez
    Implemented ArchiveFacade (in-memory persistence of court cases)
    Tested and verified that memory persistence remains between login sessions
    Profile Authentication
    20% of final project
vma5156 | Vrinda Agarwal
    Cleaned up code
    20% of final project
