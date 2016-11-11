Developing Drools and jBPM
==========================

**If you want to build or contribute to a droolsjbpm project, [read this document](https://github.com/droolsjbpm/droolsjbpm-build-bootstrap/blob/master/README.md).**

**It will save you and us a lot of time by setting up your development environment correctly.**
It solves all known pitfalls that can disrupt your development.
It also describes all guidelines, tips and tricks.
If you want your pull requests (or patches) to be merged into master, please respect those guidelines.

Reminder for working in a collaborative environment (with Git):

To keep your master in sync with the main master (requires that you keep your master branch unaltered):
 git fetch upstream
 git checkout master
 git reset --hard upstream/master

To start a new branch from the same point as the current master branch
 git fetch upstream && git checkout -b mySecondTopic && git reset --hard upstream/master

To re-sync your topic branch with master, use merge:
 git merge upstream/master

To see differences using cli
 git diff origin...HEAD

Global git commands (impacts all drools repositories)
 droolsjbpm-build-boostrap/script/git-all.sh [gitCommand]

More details : https://github.com/droolsjbpm/droolsjbpm-build-bootstrap/blob/master/README.md#working-with-git