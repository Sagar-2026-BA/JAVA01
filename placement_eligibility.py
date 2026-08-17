"""
REG no.
CGPA
no. of active backlogs
coding test score
aptitude test score
"""
qualificated="Eligible"
names=["Ram","Mahesh","Lakshith","Phogesh"]
for i in names:
    print(i)
    regno=input("Enter the reg no.:")
    cgpa=float(input("Enter the cgpa:"))
    backlogs=float(input("Enter no.of backlogs:"))
    coding_score=float(input("Enter the coding score:"))
    aptitude_score=float(input("Enter the aptitude score"))
    if(cgpa>=7.0 and backlogs==0 and coding_score>=60 and aptitude_score>=50):
        print("Eligible")

    else:
        print("Not eligible")
    

if (Eligible):

    print("The names of the eligibles:",i)
