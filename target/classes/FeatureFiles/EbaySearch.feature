@regression @smoke @jira-1234
Feature: Ebay Search Functionality
Scenario: Search for shoes
				Given open Ebay Homepage
				When Search for shoes
				Then Item list should have only shoes related products