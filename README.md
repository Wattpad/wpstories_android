## Welcome 👋

We are excited to start the technical interview process for an Android engineer at Wattpad 🎉

## Overview
This project fetches the list of stories using an endpoint and displays it in a `RecyclerView`.
But it does it in a very inefficient way and we think it can be optimised.

## Task
Spend some time understanding the codebase. Then you need to find out all the problems/inefficiencies in this project and walk us through how you will optimise/refactor the project.
Next, you need to implement one of the optimisation that you choose.


To give you a better understanding of the requirement, here's a detailed explanation:

### Requirement:

The goal of the coding challenge is to create an Android application that efficiently displays a large list of stories. The app should be able to handle a dataset of 10,000 stories and allow users to scroll through them smoothly without experiencing significant lag or performance issues. Use Jetpack Compose to build the UI and MVVM + CLEAN architecture as the primary design pattern.


### Inefficient Solution:

The starter project provided here implements a native Android solution that uses a ListView to display the list of stories. This approach is inefficient because it loads all 10,000 stories into memory at once, even though only a few of them are visible on the screen at any given time. This can lead to performance issues, especially on devices with limited memory.


### Clarifying Requirement:

To ensure that you have a clear understanding of the requirement, here are some additional points to consider:
The stories are represented as simple data objects with properties such as title, author, and a short description.
The app should allow users to infinitely scroll through the list of stories vertically.
The app should display 10 stories per page(API iteration).
The app should efficiently load and display the next page of stories as the user scrolls down the list.


We're are looking for an opportunity to observe your problem solving & engineering skills and how you explain the solution to us.
We don't expect them to finish the task given lack of time.

Good luck 🍀
