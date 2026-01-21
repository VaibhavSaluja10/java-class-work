# GitHub Setup Guide for Your Class Work

## What's Already Set Up ✅
- ✅ Git repository initialized (.git folder exists)
- ✅ .gitignore file configured to ignore unnecessary files
- ✅ GitHub CLI (gh) installed

## Files That Will Be Uploaded:
- All Day00 to Day20 folders
- Java source files (.java)
- Any documentation files

## Files That Will Be IGNORED (Automatically):
- .class files (compiled files)
- .metadata folder (Eclipse settings)
- .settings, .classpath, .project (Eclipse project files)
- bin/ folders (compiled output)
- .vscode/ (VS Code settings)
- Other unnecessary folders: createTable, delete, ETP, get, put, HBase Filter, Odd_Even
- Batch scripts (.bat files)

## Step-by-Step Instructions:

### Option 1: Create a NEW repository on GitHub (EASIEST)
1. Open Command Prompt (cmd) in your workspace folder
2. Run this command (replace 'your-repo-name' with your desired name):
   ```
   gh repo create your-repo-name --public --source=. --remote=origin --push
   ```
   Example:
   ```
   gh repo create java-class-work --public --source=. --remote=origin --push
   ```

### Option 2: Use an EXISTING repository
1. Create a repository on GitHub website (if not already created)
2. Open Command Prompt in your workspace folder
3. Run these commands:
   ```
   git remote add origin https://github.com/YOUR-USERNAME/YOUR-REPO-NAME.git
   git branch -M main
   git push -u origin main
   ```

### For Future Updates (Automatic):
Just double-click the file: `push_all_to_github.bat`
- It will automatically detect changes
- Commit them with timestamp
- Push to GitHub
- All in one click!

## What the Script Does:
1. Checks if git is initialized ✓
2. Adds all files (except those in .gitignore) ✓
3. Commits with timestamp ✓
4. Pushes to GitHub ✓
5. Shows success/error messages ✓

## Verify Your Upload:
After running the script, visit:
https://github.com/YOUR-USERNAME/YOUR-REPO-NAME

You should see all your Day folders there!

## Common Issues:

### "No remote repository found"
- You need to create a GitHub repository first
- Use Option 1 or Option 2 above

### "Permission denied"
- Run: `gh auth login`
- Follow the prompts to authenticate

### "Updates were rejected"
- Someone else made changes to the repo
- Run: `git pull origin main` first, then push again

## Need Help?
- Check GitHub CLI docs: https://cli.github.com/manual/
- Or ask your teacher for the repository name/URL
