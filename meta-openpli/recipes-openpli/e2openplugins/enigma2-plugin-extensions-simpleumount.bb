MODULE = "SimpleUmount"
DESCRIPTION = "Unmounter for mass storage devices"
MAINTAINTER = "ambrosa"

inherit gitpkgv
PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"

require conf/license/license-gplv2.inc
require openplugins-distutils.inc

SRC_URI = "git://github.com/E2OpenPlugins/e2openplugin-SimpleUmount.git;protocol=git"

