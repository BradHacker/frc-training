# FRC Team 5546 Java Training

Welcome to FRC Team 5546's Java training bootcamp. If you already have the correct dev environment set up, you cna skip the getting started. Otherwise please continue below **reading everything, not jsut skimming.**

## Latest Versions

| VSCode Version | WPILib Extension Version | JDK Version |
| :------------: | :----------------------: | :---------: |
| 1.30.1         | alpha 4                  | OpenJDK 8   |

## Table Of Contents

1. [Prerequisites](#prerequisites)
2. [Getting Started](#getting-started)
    1. [Installing Java](#installing-java-openjdk-8)
    2. [Installing VSCode](#installing-vscode)
    3. [Installing Git](#installing-git)
3. [How To Continue](#how-to-continue)

## Prerequisites

- Windows 10/8 or macOS 10.9+

## Getting Started

### Installing Java (OpenJDK 8)

Go to [Oracle's Java Downloads](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) and download the **8u191** version for your operating system. *Be sure to accept the the license agreement above the download links.*

#### Windows

Run the `.exe` file that you downloaded based on your architecture (`x86` or `x64`). All of the defualt installer options should be fine.

Open **Control Panel** and go to **System**. Then click on **Advanced system settings** and click the **Environment variables** button. Find the `PATH` variable under *System Variables* (most likely the bottom list) and edit it. Add the location of the `bin` folder to the path variable (*e.g. `C:/Program Files/Java/jdk1.8.0_191/bin`*).

**For Windows 10 users**, when editing the `PATH` variable, it may list each item in a table. If so, just add the file path to the next blank cell and hit okay.

**For Windows 8/8.1 users**, when editing the `PATH` variable, it may show as one long line of text. If so, just add a `;` (*semicolon*) at the end, then put the path to the `bin` folder after.

Add a new system variable with the name `JAVA_HOME` and the value will be the path to the java installation folder (*same as the one you added to `PATH`, but without the `/bin` on the end*).

#### macOS

Run the downloaded `.dmg` file and then double-click the `.pkg` icon that is in the window that opens. Follow the installation instructions.

### Installing VSCode

[Download](https://code.visualstudio.com/download) the version for your operating system. Follow the installer and move on once you see something similar to the image below.

![VSCode Startup](https://s3.amazonaws.com/screensteps_live/image_assets/assets/001/763/331/original/020708a2-bf93-4a74-9430-1d452d1f6833.png?1532302727)

### Installing Extensions

Open the extensions tab

![VSCode Extensions Tab](https://s3.amazonaws.com/screensteps_live/image_assets/assets/001/903/520/original/b4b9b9ef-7478-4b03-b7c1-00423ae266c1.png?1536691956)

Install the **Java Extension Pack** by Microsoft

Download the [WPILib_Mac-2019.4.1.tar.gz](https://github.com/wpilibsuite/allwpilib/releases) for _macOS_ and [WPILibInstaller_Windows64-2019.4.1.zip](https://github.com/wpilibsuite/allwpilib/releases) for _Windows_ *(click on the `.vsix` file)*.

![WPILib Alpha 4](https://s3.amazonaws.com/screensteps_live/image_assets/assets/001/763/325/original/cd12121e-c67f-43f9-93d1-f897ecb0a68d.png?1532302171)

To install the WPILib Extension go to the VSCode Extensions tab and 1) click the **... button** above the search bar, then 2) click **"Install from VSIX..."**. Then select the `.vsix` file frem the previous step and click install. After it loads, press the **reload** button.

![Installing WPILib Extension](https://s3.amazonaws.com/screensteps_live/image_assets/assets/001/763/329/original/f4862dc3-f586-42ca-b440-37de3eaf83a5.png?1532302173)

### Installing Git

[Download Git](https://git-scm.com/downloads) and run the installer. All of the defualt options should be fine.

## How To Continue

In VSCode, open the powershell/terminal (**Windows:** press `Ctrl+~` or **Mac:** `Cmd+~`).

To continue the lessons, run the following commands:

```bash
cd ~
git clone https://github.com/bradhacker/frc-training.git
git checkout lesson1
```