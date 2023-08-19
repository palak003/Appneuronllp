# Appneuronllp
Internship Assignment

Here I have attached drive link containing postman api video and screenshot of my mongodb cluster db:
https://drive.google.com/drive/folders/1mNJwDYhzCIEwn86AmqGkMK-OpHUW2HEw?usp=sharing

I have exposed two endpoints:
POST: for creating a new food item
GET: To make a fuzzy search on name column using search index

I have demonstrated some test cases of postman endpoints in the video, some of them are as follows:
1) If someone writes choleeee bhaure in (name field): Then also it can get chole bhature from db
2) If someone writes pizza domeno in (name field): It can retrieve dominos cheese pizza
3) If someone writes bhaji pao in (name field): It can retrieve pao bhaji from db

Basically I have made use of mongo-db atlas search feature with autocomplete operator
Then i made aggregation pipelines on atlas ui and exported that pipeline in java language to include it in my code

Main functions used in atlas search (fuzzy operator) were:
prefix-length: to match how many beginning characters of query string and name string exactly match.
max-edits: how many alterations/spelling mistakes are allowed in user query.

Thanks for reading!
