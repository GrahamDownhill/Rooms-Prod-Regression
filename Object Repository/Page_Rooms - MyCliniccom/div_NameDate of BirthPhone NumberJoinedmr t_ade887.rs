<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_NameDate of BirthPhone NumberJoinedmr t_ade887</name>
   <tag></tag>
   <elementGuidId>e47bb36a-a2bf-4016-8ee2-dfc9912ec7f7</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='content']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#content</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>content</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

            
    
        
        
        
            
        

    


            
            

                
    NameDate of BirthPhone NumberJoinedmr testy test18 Mar 19670777777777777758 secondsOfflineInvitations×Full nameEmail/Phone




    
        
            
                Patient Identity Check
                
                    ×
                
            
            
                Please check the identity of the ‘patient’ on the video call as being the individual you wish to consult with.  We encourage you to follow your normal local guidelines on how to do this (checking address, date of birth etc).
            
            
                Close
            
        
    




    
        
            
                Attachments
                
                    ×
                
            
            
                
                    
                
            
            
                Close
            
        
    


    
        
            
                Attachments
                
                    ×
                
            
            
                
                
            
            
                Close
            
        
    


    
        
            
                Attachments
                
                    ×
                
            
            
                
                    
                        To view this video please enable JavaScript, and consider upgrading to a
                        web browser that
                        
                            supports HTML5 video
                        
                    
                
            
            
                Close
            
        
    


    function showAttachmentModal(url) {
        var parsedUrl = parseURL(url);
        console.log(parsedUrl);

        if (parsedUrl.pathname.toLowerCase().endsWith(&quot;.pdf&quot;)) {
            showAttachmentModalPDF(url);
        } else if (parsedUrl.pathname.toLowerCase().endsWith(&quot;.mp4&quot;) || parsedUrl.pathname.toLowerCase().endsWith(&quot;.mov&quot;)) {
            showAttachmentModalVideo(url);
        } else if (parsedUrl.pathname.toLowerCase().endsWith(&quot;.png&quot;) || parsedUrl.pathname.toLowerCase().endsWith(&quot;.jpg&quot;) || parsedUrl.pathname.toLowerCase().endsWith(&quot;.jpeg&quot;)) {
            showAttachmentModalIMG(url);
        }
    }

    function showAttachmentModalVideo(url) {
        $('#modal_attachments_video').modal();
        var myPlayer = videojs('attachment-video-player');
        $('#attachment-video-player').width('auto');
        myPlayer.src({ src: url });
        myPlayer.ready(function () {
            myPlayer.play();
        });
    }

    function showAttachmentModalPDF(url) {
        $('#pdf-viewer').attr('src', '/r/vendor/pdfjs/web/viewer.html?file=' + btoa(url));
        $('#modal_attachments_pdf').modal();
    }

    function showAttachmentModalIMG(url) {
        $('#attachment-view-img').attr(&quot;src&quot;, url);
        $('#attachment-view-img-a').attr(&quot;data-big&quot;, url);

        $('#modal_attachments_img').modal();
        $('.pan').pan();
    }




    
        
            
                Invite patients to join your clinic via text (sms) or email
            
            

                
                    You are going to send the following message (red words will be replaced with appropriate values):
                

                

                

                
                    
                        
                            Full name
                        
                        
                            Email/Phone
                        
                        
                            Time
                        
                    

                    

                    

                    
                        Cancel
                        
                            
                            Send invitation
                        
                    
                
            
        
    



            
            
        </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='content']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='content-wrapper']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Logout'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='中文(台灣)'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div/div/div</value>
   </webElementXpaths>
</WebElementEntity>
