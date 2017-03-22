   
delete from account;
delete from art;
delete from profiles;
delete from gallery;
delete from location;

-- location
insert into location(id, street, streetNO, postalcode, city, country)
 values (11,'terra','33','8404','winti','zuri');
 
insert into location(id, street, streetNO, postalcode, city, country)
 values (22,'haltenreben','43','8408','seuzach','zuri');

 --Profiles
 insert into profile(id,artist_name,description,title,owner_id)
 values (1,"Smithinator","I am Schmitti the great artist","Schmiti's Page",1);
 
 --Accounts   
 insert into account(id, first_name, last_name, user_name, location_id, profile_id,created_at, email, password)
 values (1,'john','smith',"smithi",11,1,'j@smith.com','password');
 
--Art
insert into art(id,name,description,title,picture,rating,created_at,is_sold,price,owner_id)
values (1,"pretty picture","i did it while beeing asleep","Sleeping sleep","url here",'1991-02-28',false,12,1);

--Galleries
 insert into gallery(id,name,description,title,created_at,owner_id)
values (1,"pretty picture","i did it while beeing asleep","Sleeping sleep",'1991-02-28',1);
    
 -- account_profile
 insert into account_profile(user_id,profile_id) values (1,1);
 
  
 -- gallery_artObject
 insert into gallery_artObject(gallery_id,artObject_id)values(1,1);

 
 
 
 


